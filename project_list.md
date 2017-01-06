## Possible Projects for CS1980/CS1640(Project) Students

Please email me your top THREE choices by Wednesday (11 Jan) morning at 11:59 AM (i.e., right before noon).  Please list them in the order that you prefer them.  You will be informed as to your project during the next Capstone class on Friday 13 Jan.  If you do not email me by then, I will assume you do not care which project you are on and I will place you on whichever one that still need people.

Along with your selections, please include any qualifications you have that for that specific project.  For example, if you have done mobile development, and you are signing up for the ASL dictionary project, please mention that.  Remember that you are "interviewing" for the project against others, especially if you have selected popular projects.  You may want to add a resume, although that is not strictly necessary.  Students who respond early also show enthusiasm for the projects, which goes a long way to showing that they actually want to do them.

I will attempt to place you in one of your top three choices.  Last semester, every student got into one of their top three, although I do not make any guarantees.

### Industry Projects

These are projects where you will be working directly with a company.  Note - if you end up on an Industry project, your course registration will change to CS1981.  This is an administrative detail and will have no impact on you other than a slightly different number appearing on your transcript.

_NetApp_: NetApp currently maintains a clustering engine in the ONTAP product that provides the node communication model, quorum system and high availability management.   Pacemaker is an open source cluster resource manager that utilizes Corosync for membership and messaging.  The Corosync Cluster Engine is an open source group communication system that the Cluster Services team is considering as a replacement for components of the in-house clustering infrastructure.  The objective is to utilize Pacemaker (and Corosync under the covers) to satisfy the use cases that correspond to scenarios within NetApp’s ONTAP product.   The expectation for the team would be to establish a four node cluster environment using a VM, setting up Pacemaker to create a cluster configuration and develop a wrapper process (in your choice of programming language) to front the interactions to Pacemaker.    A stretch goal would be to develop a separate process that drives automated workflows to verify the behavior within our expected scenarios. (POC: Chuck Heinle)

_Viz_: TBD project on information visualization.  Last semester, this involved automated transcription and categorization of audio. (POC: Dr. Mike Bigrigg)

### Faculty Projects

These are projects working with academic faculty, either at the University of Pittsburgh or elsewhere.

_Spider Robot_: The CS department has a spider robot. This robot consists of six legs where each leg consists of 3 servo motors. The main goal of this project is give the spider robot an ability to walk around in any directions using a remote control such as a joystick. Students who work on this project are required to update some hardware such as micro controller unit (Raspberry pi, Arduino, etc) and servo motor controllers to ensure that the robot is in a good working condition. Then students must write a program (C/Python) to control all 18 servo motors to work synchronously and ensure that the robot can walk around without falling down. Note the limit for the size of this group is 2. (POC: Dr. Thumrongsak Kosiyatrakul (Tan), University of Pittsburgh Computer Science Department)

_Sterile Compound Training in Augmented/Virtual Reality_: An augmented/virtual reality game for Pharmacy students to learn how to deal with sterile compounding.  This is a greenfield project, and so choices regarding framework, language, etc. will be determined by the students with the input of the POC. (POC: Dr. Ravi Patel, University of Pittsburgh School of Pharmacy)

_Pharmacy Quiz Game_: A currently existing application, this is an extendible web-based quiz game for Pharmacy students.  Work would include adding additional features and moving away from Google App Engine to new platform (perhaps Docker on AWS?). (POC: Dr. Ravi Patel, University of Pittsburgh School of Pharmacy)

_LensKit Recommendation System_: This project is to develop a web-based dashboard for monitoring the progress of large, data-intensive experiments in recommender systems. These experiments involve testing many algorithms on large data sets, can take hours to days to complete, and users need to be able to see what has been done, what is currently in-progress, and what work is left to do. No recommender systems experience is necessary. LensKit is written in Java, using Gradle and Groovy. (POC: Dr. Michael Ekstrand, Boise State University)

_Cellular Image Analysis_: Write software for image analysis project assembling a computational pipeline to extract data from live cell movies.  This would involve integrating some already-existing pieces of a computer vision pipeline, setting it up in a Windows Matlab environment, and adding reporting statistics for single cells and system parallelization. (POC: Dr. Robin Lee, Computational and Systems Biology at the University of Pittsburgh)

_ASL Dictionary_: Provide a secure dictionary app for American Sign Language 1 and 2 students to use at the University of Pittsburgh.  This would be for mobile phones, preferably both Android and iOS.  Choice of framework and language will be determined by the students in the group. (POC: Debra Hast, Less-Commonly-Taught Languages Center)

### Open-Source Projects

These are projects working with the open-source community.  

_Haiku_: Help develop the Haiku operating system, an open-source version of BeOS. Note that there can be multiple groups working on this project, as long as they are working on different ideas (see below for list). (POC: Alex)

Description: Potential ideas - https://www.haiku-os.org/community/gsoc/2016/ideas

_rst_: Develop a requirements tracking tool for developers, in Rust and Elm.  Projects could include developing the front end, adding test tracking, or making the back-end concurrent.  Great if you are interested in systems engineering or looking to learn a new functional programming language. (POC: Garrett Vitiral)

Details: https://github.com/vitiral/rst

_Linux kernel tinification_: Minimizing the size of the Linux kernel. Note that you will not need in-depth knowledge of Linux kernel internals or of the C language; the POC is OK with teaching these as you go along. (POC: Josh Triplett)


_libav_: Audiovisual encoding/decoding, in C or Rust. C work would involve finding and fixing security issues; Rust work would involve implementing a video codec.  It is the choice of the team which they would like to pursue.  (POC: Luca Barbato)