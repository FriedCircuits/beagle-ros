DESCRIPTION = "ROS package for the BeagleBone for ROS Serial Arduino."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9ded6e9dedc494f5f793a6690ba5"

DEPENDS = "gcc-avr avr-libc std_msgs sensor_msgs geometry_msgs nav_msgs rosserial_client message-generation"

SRC_URI = "git://github.com/FriedCircuits/rosserial-arduino.git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit catkin
