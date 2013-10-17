DESCRIPTION = "ROS package for the BeagleBone for ROS Serial Server in C++."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosserial-msgs std-msgs roscpp topic-tools"

require rosserial.inc
