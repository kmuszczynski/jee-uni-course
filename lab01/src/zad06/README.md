To create a executable jar use:

`javac MyClass.java`

`jar -cvfm jarName.jar META-INF/MANIFEST.MF MyClass.class`

Where MANIFEST.MF must contain following line:

`Main-Class: my.package.NameOfTheMainClass`

For this to work, path to the `.class` file must match package structure, apparently?

Which in this particular case meant running the command from inside `/src/`, which doesn't seem very correct.