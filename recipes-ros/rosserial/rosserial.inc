SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/hydro-devel.tar.gz"
SRC_URI[md5sum] = "0b49402c54f7b4a13b373735ebf66f29"
SRC_URI[sha256sum] = "18d6e1de8fecd6317766a6b52cf6fb781d8572ca8ddafcbddb705f3e095d025a"


S = "${WORKDIR}/${ROS_SPN}-hydro-devel/${ROS_BPN}"

inherit catkin

ROS_SPN = "rosserial"

