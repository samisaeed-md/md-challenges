#!/bin/bash

# Loop through everything in the current directory
for dir in */; do
    # Check if it actually exists as a directory (handles empty folders safely)
    if [ -d "$dir" ]; then
        echo "Entering $dir..."
        cd "$dir"
        
        # Delete the .git folder if it exists
        if [ -d ".git" ]; then
            sudo rm -rf .git
            echo "-> Deleted .git in $dir"
        else
            echo "-> No .git folder found"
        fi
        
        # Step back out to the parent directory
        cd ..
    fi
done

echo "Done!"
