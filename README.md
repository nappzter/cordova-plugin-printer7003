## Cordova Printer 7003 for H1050B Android POS
Cordova-wrapped printer 7003 SHRET POS 

## Summary
This is a cordova plugin to wrap the Printer 7003 .jar and .so libraries. The intent is to import this wrapper plugin into existing cordova POS APK for receipt printing.

Plugin will be installed into cordova (android) app directory structure under the following folders:

- /libs/armeabi/libprinter7003.so
- /libs/printer7003.jar

## Prerequisite
 - Android libprinter7003.so
 - Android printer7003.jar
 
## How to install
1. Open Cordova project at CLI
2. Run add Cordova plugin command at CLI:
  - cordova plugin add https://github.com/nappzter/printer7003v2.git
  
## Print Functions
The following functions are available for printer 7003

### Create Printer
<i>Printer printer = new printer();</i>
