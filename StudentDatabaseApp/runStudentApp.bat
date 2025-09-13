@echo off
REM Change directory to the project folder
cd d CUsersuserDesktopStudentDatabaseApp

REM Compile all Java files
javac DBConnection.java Student.java StudentDAO.java Main.java

IF %ERRORLEVEL% NEQ 0 (
    echo Compilation failed. Fix errors and try again.
    pause
    exit b
)

REM Run the program
java Main

pause
