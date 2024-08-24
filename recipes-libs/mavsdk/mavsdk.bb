DESCRIPTION = "MAVSDK is the Dronecode SDK for MAVLink."
HOMEPAGE = "https://github.com/mavlink/MAVSDK"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "gitsm://github.com/mavlink/MAVSDK.git;protocol=https;branch=v2.12;tag=v2.12.3"

# Define the dependencies



S = "${WORKDIR}/git"
do_configure[network] = "1"
do_compile[network] = "1"

# Build configuration
EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"
DEPENDS = "curl jsoncpp libtinyxml2 xz mavlink gtest"

inherit cmake