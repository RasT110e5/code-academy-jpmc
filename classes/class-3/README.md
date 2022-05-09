# Class 3 - Git - Remote

## **Topics**

- **Git Review**
    - [Why do we use Git?](#why-do-we-use-Git?)
    - [Local vs remote repositories](#local-vs-remote-repositories)
    - GitHub repository creation
    - [What is a branch and what is it for?](#what-is-a-branch-and-what-is-if-for?)
    - [Basic commands](#basic-commands)
    - [Merging and conflicts](#merging-and-conflicts)
- **Building a Portfolio**
    - [What is a coding portfolio?](#what-is-a-coding-portfolio?)
    - [Use of Git & GitHub](#use-of-git-&-GitHub)
    - [Hackerrank & exercises](#HackerRank-&-exercises)

## Git review
-----------------

### Why do we use Git?

Git, as a version control system, allows handling several versions of a file or set of files in a repository. What is a version? Anything that differs form the original.

How does it work? "Git thinks of its data more like a series of snapshots. With Git, every time you commit, or save the state of your project, Git basically takes a picture of what all your files look like at that moment and stores a reference to that snapshot. To be efficient, if files have not changed, Git doesn’t store the file again, just a link to the previous identical file it has already stored. Git thinks about its data more like a stream of snapshots."

![System](/classes//class-3//images/git_snapshots.png)

Can you delete something on Git?

### Local vs remote repositories

First, let's talk about local and remote repositories. As you know from the previous class, Git is a DVCS (distributed version control system). That means that there are multiple repositories instead of there being just one.

![System](/classes//class-3//images/distributed_version_control.png)

But if there are multiple repositories, which one is the *real* one? Well, developers agree on having that one on a server of some sort. Each programmer then clones that entire repository and shares their changes by submitting changes to the one in the server.

From your machine's perspective, the repository on the server is the remote repository. The repository on your machine is the local repository. As you will see, everything will happen in a local repository.

### What is a branch and what is if for?

A branch is a stream of snapshots or **commits**. Each branch can represent a version of the project where there is a **main** version or branch.

![System](/classes//class-3//images/git_branches.png)

Team members agree on what to call that branch, but it really could be called anything.

There can be virtually infinite branches on a git repository. But normally teams come up with a branching model that they will follow. For example, one of the branching models in software development can be like this:

main --> develop --> feature/[feature_name] --> develop --> release/[release_number] --> main

From main we create the develop branch. From develop we create the feature branch were we work on our changes. We then **commit** our changes and **push** them to our remote branch. We then submit a request to **merge** our feature branch to develop. Same request to merge develop to release and same request to merge release to main.

This way we have pushed our change through separate environments or versions, testing it in all versions.

### Basic commands

Which commands would we use in order to do all that? Thankfully just a few and easy to learn.

- git checkout -b [new branch] [branch to copy from]
- git status
- git add [file name]
- git commit
- git push


### Merging and conflicts

So far is all fine and dandy, Git solves everything without any interaction from us! Right...? Right?!

...Well no. But do not worry, it is not that complex if you follow your branching model and commit changes responsibly.

If two branches change the same line in the same file and then one of them is merged to the main branch, what happens when we try to merge it to main? MERGE CONFLICT.

In order to solve the conflict, you need to look at the file and figure out what needs to be kept. Either what is in the target branch or in the branch you want to merge. Once those conflicts are solved, simply commit then and presto!


## Building a Portfolio
-----------------

### What is a coding portfolio?

A coding portfolio is basically a showcase of personal projects. Developers that have one, link their portfolios to their resumes. Perhaps one project inside that portfolio is a really good looking resume created as a website.

![System](/classes//class-3//images/github_profile.png)

But are they necessary? In terms of getting hired, not really. There is a shortage of developers pretty much everywhere. So do not feel like you need to have a portfolio at all.

Having said that, we are going to be taking advantage of this concept in this course.

### Use of Git & GitHub

With all we have learned about Git and GitHub so far, we can start using them to publish projects (files, exercises, other documents) to GitHub. Allowing us to not only share our projects easily, but also create a remote backup.

For this Code Academy, we recommend to all participants to publish the exercises they are doing or have done to their personal repositories in GitHub. Mentors will be able to follow your progress, commitment and help if you are stuck or using "unorthodox" coding practices.

Use whatever branching model you want but once you choose one, stick to it. A basic rule might be, unless an exercise is finished it does not get merged into the main branch.

### Hackerrank & exercises

There is a website called [HackerRank](https://www.hackerrank.com/) that we are going to be using. The website does many things that you should checkout, but we are going to be mostly using it for exercises.

You can create an account using your already created GitHub account. Under the "Prepare" section, you will find lots of exercises varying in difficulty. HackerRank allows you to do those exercises without leaving the website, but we recommend trying to solve them in your local machine. That way you are getting used to using your own local development environment and tools as well as publishing your work to your GitHub profile.

While you should feel free to go ahead and start doing any of the exercises there, we might also recommend particular ones that we feel may challenge you a bit more.
