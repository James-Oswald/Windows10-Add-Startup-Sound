# Windows10-Add-Startup-Sound
A .jar that plays a random windows startup sound from one of eight legacy windows versions.

## Background 
The original version of this project was made September 2016 when I transitioned over to Windows 10 from Windows 7. I really missed the startup sounds from my childhood. I figured I would make a Java program that let me play them and a few of my other favorite iconic windows startup sound by putting a vbscript that ran my java class in my startup folder. 

Four years later, June 2020, I’ve found this project on an old USB flash drive, and uploaded it to my github. I’ve decided to give the project new life by firstly encapsulating it in a jar, then encapsulating the jar in an exe that can be dropped right in the startup folder. The original project done in 2016 can still be found in the "Original" branch.

## Features 
Randomly plays one of my 8 favorite Windows startup noises when executed.
The potential tracks are:
1) NT  
2) NT5  
3) 95  
4) 98
5) 2000
6) vistaBeta
7) XP
8) 7
 
## Usage
In `/build/` you will find a jar and an exe. The jar is an executable that will play one of the seven tracks, the exe is a wrapper with the jar inside of it that can be placed in your startup folder, since the startup folder won’t run jars. 
