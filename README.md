## Cordova Printer 7003 for H1050B Android POS
Cordova-wrapped printer 7003 SHRET POS

## Summary
This is a cordova plugin to wrap the Printer 7003 .jar and .so libraries. The intent is to import this wrapper plugin into existing cordova POS APK for receipt printing.

Plugin will be installed into cordova (android) app directory structure under the following folders:

- /libs/armeabi/libprinter7003.so (<i>in version ARMv5 or older</i>)
- /libs/armeabi-v7a/libprinter7003.so (NDK 6+)
- /libs/printer7003.jar

## Prerequisite
 - Android libprinter7003.so
 - Android printer7003.jar

## How to install
1. Open Cordova project at CLI
2. Run add Cordova plugin command at CLI:
  - cordova plugin add https://github.com/nappzter/cordova-plugin-printer7003.git

## Print Functions
The following functions are available for printer 7003

### Create Printer
<i>Printer printer = new printer();</i>

### Open Printer
<i>printer.open()</i>

### Close Printer
<i>printer.close()</i>

### Print String
<i>printer.printString()</i>

#### usage:
printer.printStirng(“hello,the world”);

## Printer Interface Functions in printer7003.jar

- Open
- Close
- Init
- queState
- setBold
- setPrintOrientation
- setInverse
- setUnderline
- setLineSpacing
- setCharacterSpacing
- setFontWidthZoomIn
- setFontHeightZoomIn
- setLeftMargin
- setRightMargin
- setAlignment
- setOnebarWidthZoomIn
- setOneBarHeight
- printString
- printBlankLines
- printUPCA
- printUPCE
- printEAN13
- printEAN8
- printCODEA9
- printITF
- printCODABAR
- printCODE93
- printCODE128
- printQR
- printDataMatrix
- printPicture
- printPictureByAbsolutePath
- printPicturebyRelativePath
- getVersion
- printSelfInfo
- printPDF417
- setFontSize
- setPrintConcentratoin
