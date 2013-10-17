DESCRIPTION = "ROS package for the BeagleBone for ROS Serial Arduino Library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gcc-avr avr-libc std-msgs sensor-msgs geometry-msgs nav-msgs rosserial-client message-generation"

require rosserial.inc
