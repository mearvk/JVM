<<<<<<< HEAD
SecureJVM & Related JVM Build Instructions:

i. Download

    You will want to make sure you have the Mercurial client installed ahead of time.  This can be installed from sudo apt-get mercurial.

    The command is 'hg clone http://hg.openjdk.java.net/jdk9' - then 'cd' to jdk9 or, for instance, hotspot. Now you will run a bash command

    'bash ./get_sources.sh'; this will connect you with the latest copy of the of the source code.  After this runs you are all set to begin examining

    the interesting source code with the OpenJDK 9.  GNU License agreement should be read if you plan to modify the code.


ii. Configure

    If you intend to compile the source code you will want to configure (a kind of compiler pre-build) the repository ahead of time.  This is easily

    tended. Inside your jdk9, dev, or hotspot folder from step i. you will have a configure.sh file.  This file contains all the logic for assessing if your

    system can compile the C source code.  After this completes successfully you will move on to building the source for the first time.  This is exciting prospect.

    Ok.  Now let's look at that command.  If you intend to run 'make test' you will run:

        >> bash ./configure --with-jtreg=/usr/lib/jtreg/4.2/jtreg --disable-warnings-as-errors

    If you intend to run the direct version 'make jdk' or 'make all' or 'make default' or 'make hotspot' then you will be fine with:

        >> bash ./configure --disable-warnings-as-errors

    Probable that you will run these with any kind of superuser preface.  Ok.  See Addendum for typical errors and solutions.

iii. Make

    From here you would want to compile a copy of the Java binaries.  If this is not what we intend then you may skip this section.  This section is about compiling

    the binaries for Java.

    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

    make clean

    The 'make clean' command comes in where you want to develop from a clean development location.  This command erases previous .so files, any binaries and configuration files

    from prior 'make' commands.  If you do not have the 'make' executable try 'apt-get install' for it.

    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

    make test

    The 'make test' command creates tests that can be run to ensure the sanity of the compiled code from the view of the development team or to demonstrate

    that certain existing or new features in fact do work.  In can in fact also mean we care to 'make' a compile without actually outputting the compiler results.

    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

    make all

    The 'make all' command creates all the targets in the Makefile.  This takes longer and in certain cases you will not want to have everything made.

    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

    make default

    The 'default' should effectively run the same process as 'make' itself.  Here whatever is basically copart to program should be built and saved to disk.

    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

    Finally output of this build is stored with you locally programmer; this is great.  Once you have built your source code you will check in the 'hotspot' or 'jdk9'

    folder to find a new folder called 'build'.  Within this folder you will have the entire build network!  Find the /bin folder and there you can see

    your newly built Java binaries.  Ok!

iv. Requirements

    Find 'jtreg' binary at https://adopt-openjdk.ci.cloudbees.com/job/jtreg/lastSuccessfulBuild/artifact/ .

=======
# JVM
SecureJVM and other definitive versions of OpenJDK
>>>>>>> a801bc77def3d8d6ce23e76c12e4f8e2569bd6c9
