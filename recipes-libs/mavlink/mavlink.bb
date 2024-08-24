DESCRIPTION = "MAVLink: Micro Air Vehicle Communication Protocol Library"
HOMEPAGE = "https://mavlink.io/en/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "gitsm://github.com/mavlink/mavlink.git;branch=master"
SRCREV = "23eb98ca00032a7edc8b6ff1eb8914ec27c7b268"
do_configure[network] = "1"
do_compile[network] = "1"
EXTRA_OECMAKE = " -DMAVLINK_DIALECT=common -DMAVLINK_VERSION=2.0"
S = "${WORKDIR}/git"
DEPENDS += "python3-pip-native python3-pip python3-lxml-native python3-lxml"
inherit cmake python3native