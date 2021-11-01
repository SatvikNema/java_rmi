# Basic Java RMI setup
## Server setup
```
cd rmi_server
mkdir classes
```
#### Compile server code
```
javac -d classes src/main/*.java
```
#### Generate stub class
```
rmic -d classes/ -classpath classes/ main.MyRemoteImpl
```

#### Go to dir where stub class is present and start the rmi registry
```
cd classes
rmiregistry
```

#### Start another terminal and register the service with the registry
```
cd rmi_server
java -cp classes/ main.Start
```

## Client setup
#### Start another terminal
```
cd rmi_client
mkdir classes
```

#### Copy the MyRemoteImpl_stub.class in the classes directory and compile the client code
```
javac -d classes/ src/main/*.java
cp ../rmi_server/classes/main/MyRemoteImpl_Stub.class classes/main/
```

#### Call the remote method to test the RMI's working
```
java -cp classes/ main.Client
```
Note: Java 8 is used in this poc
