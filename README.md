# Kotlin

## Single File

```bash
kotlinc <kotlin-file> -include-runtime -d <jar-file>
java -jar <jar-file>
```

## Multiple Files

```bash
kotlinc <kotlin-file-1> <kotlin-file-2> <...> -include-runtime -d <jar-file>
java -jar <jar-file>
```