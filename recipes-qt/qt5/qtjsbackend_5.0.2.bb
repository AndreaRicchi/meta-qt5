require qt5-${PV}.inc
require ${PN}.inc

PR = "${INC_PR}.0"

SRC_URI += " \
    file://0001-Fix-hardfloat-detection.patch \
    "

SRC_URI[md5sum] = "610f011757755888153cb2004c04446f"
SRC_URI[sha256sum] = "65071ab9ab7d9024b7ba6d128a1c97ac09cf1b37818affb4238e4ba7d6665cc0"
