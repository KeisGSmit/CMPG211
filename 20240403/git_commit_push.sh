#!/bin/bash

# Prompt the user for a commit message
echo "Enter commit message:"
read commit_message

# Add all changes
git add .

# Commit with the provided message
git commit -m "$commit_message"

# Push changes to the remote repository
git push
