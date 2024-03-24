#!/bin/bash

# Get the directory of the script
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# Navigate to the directory of the script
cd "$SCRIPT_DIR"

# Run the javac command on all Java files in the current directory
javac *.java
