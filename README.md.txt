Master/main branch is our production code and it should be stable.
Never push to master some code that was not tested!!
For each feature/functionality/test/fixes we'll use one branch.
Use a descriptive name that matches naming conventions.

To save your changes locally in git history make a commit
Use git push command to make your code from your branch appear on the remote repository

Branches allow you to work on different parts of a project without impacting the main branch
Main commands to work with branches:
GIT BRANCH <NAMe>  - creates the branch
GIT CHECKOUT <NAME> - switching between branches
GIT CHECKOUT -B <BRANCHNAME> - combined

GIT FLOW
Add changed file into Stage: GIT ADD <Files>
Performing commit on local: GIT COMMIT
                             GIT COMMIT -M "<commit message>"
Push your commit to server  GIT PUSH <Remote> <Branch>
Cheking remote for new commits GIT FETCH
                               GIT PULL <Remote> <Branch>
Git Checkout                CREATE OR MOVE TO A BRANCH
GIT REBASE vs. GIT MERGE 
    REBASE - move the commits from remote branch on top of master commits
    MERGE - adds a new merge commit, preserving the history 



New things that I've learned:
- GIT INIT command to be used when a new git repository is created locally (or before an existing repository will be cloned)


- mv File_Name File_New_Name command that I used to change/convert .gitignore.text into .gitignore