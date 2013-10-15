DESCRIPTION = "ROS package for the BeagleBone for ROS Serial Messages."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9ded$

DEPENDS = "message-generation"

SRC_URI = "git://github.com/FriedCircuits/rosserial-msgs.git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit catkin
