DESCRIPTION = "ROS package for the BeagleBone for ROS Serial Arduino Library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std_msgs sensor_msgs geometry_msgs nav_msgs rosserial_client message-generation"

require rosserial.inc
