DESCRIPTION = "ROS package for the BeagleBone for ROS Serial Server."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9ded6e9dedc494f5f793a6690ba5"

DEPENDS = "rosserial_msgs std_msgs roscpp topic_tools"

SRC_URI = "git://github.com/FriedCircuits/rosserial-msgs.git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit catkin
