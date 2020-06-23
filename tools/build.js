

let fs = require("fs");
let cp = require("child_process")

function main(){
    try{
        process.chdir(__dirname + "/..");
        fs.rmdirSync("./tmp", {recursive: true});
        fs.mkdirSync("./tmp", {recursive: true});
        cp.execSync("javac -d tmp src/sound.java");
        cp.execSync("jar cvfm ./tmp/startsound.jar ./src/manifest.mf -C tmp . -C src sounds");
        fs.copyFileSync("./tools/converter.js", "./tmp/converter.js");
        cp.execSync("node ./tmp/converter.js startsound.jar");
        fs.copyFileSync("./build/startsound.jar", "./build/startsound.jar");
        fs.copyFileSync("./tmp/startsound.exe", "./build/startsound.exe");
        fs.rmdirSync("./tmp", {recursive: true});
    }catch(err){
        console.error(err);
    }
}

main();