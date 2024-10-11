## Usage
```shell
taniel.tari@tanieltari rebus2gtfs % ls -l
total 67256
-rw-r--r--@ 1 taniel.tari  staff  11010004 Oct  7 21:37 Ridango_240408-240609.zip
-rw-r--r--@ 1 taniel.tari  staff  23424346 Oct 11 09:44 rebus-to-gtfs-1.0-SNAPSHOT-all.jar
taniel.tari@tanieltari rebus2gtfs % java -jar rebus-to-gtfs-1.0-SNAPSHOT-all.jar Ridango_240408-240609.zip
[INFO] 2024-10-11 10:11:22.514 Main - Loading REBUS file...
# logs omitted...
[INFO] 2024-10-11 10:11:40.240 Main - GTFS created, have a nice day!
taniel.tari@tanieltari rebus2gtfs % ls -l
total 145304
-rw-r--r--@ 1 taniel.tari  staff  11010004 Oct  7 21:37 Ridango_240408-240609.zip
-rw-r--r--@ 1 taniel.tari  staff  39898722 Oct 11 10:11 gtfs.zip
-rw-r--r--@ 1 taniel.tari  staff  23424346 Oct 11 09:44 rebus-to-gtfs-1.0-SNAPSHOT-all.jar
```
## Build
```shell
./gradlew shadowJar
```