
Author: Gudinsky Aleksey

Release Task

What we have? 
A script that's install all needed environment with admin user for wordpess.
All you have to do is do one thing

1 Run go.sh script in command line

-------------------------------------------------------------------------------------
 It is build on Mac OS, that's why if you want to use this script on linux system, 
 you need to change chromedriver powered by mac os version to linux. 

Requirements
------------
* VirtualBox <http://www.virtualbox.com>
* Vagrant <http://www.vagrantup.com>
* Git <http://git-scm.com/>

Usage
-----
### Startup
	$ ./go.sh

The Wordpress instance (running on Apache) is available at [http://localhost:8888](http://localhost:8888)

#### MySQL
Externally the MySQL server is available at port 8889, and when running on the VM it is available as a socket or at port 3306 as usual.
Username: root
Password: root

#### WordPress
Script use dump of clean wordpress based on 4.7 version with admin user.
Username: admin
Password: admin

Technical Details
-----------------
* Ubuntu 14.04 64-bit
* Apache 2
* PHP 5.5
* MySQL 5.5
* Wordpress 4.7

The web root is located in the project directory at `src/` and you can install your files there

And like any other vagrant file you have SSH access with
	$ vagrant ssh
