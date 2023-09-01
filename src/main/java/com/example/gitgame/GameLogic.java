package com.example.gitgame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Random;

public class GameLogic {
private static boolean gameRunning = true;
private static ArrayList<Integer> indices = new ArrayList<>();
private static ArrayList<Integer> incindices = new ArrayList<>();
private static int numCorrect = 0;
    public static void weGaming() {
        System.out.println("Welcome to the game");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose a mode Hard or Normal");
        String gameMode = myObj.nextLine();
        boolean lax = true;
        while(lax) {
            if (gameMode.equals("Hard") | gameMode.equals("Normal")) {
                lax = false;
            } else {
                System.out.println("Do you think that you are funny?");
                System.out.println("try again");
                gameMode = myObj.nextLine();
            }
        }
        if (gameMode.equals("Hard")) {
            for (int i = 1; i < Vocab.getMap().size(); i++) {
                indices.add(i);
            }
            System.out.println("You have chosen the difficult path");
            int max = Vocab.getMap().size();
            int min = 0;
            while (gameRunning) {
                Integer result = (int) (Math.random() * (max - min) + 1);
                if (indices.contains(result)) {
                    System.out.println(Vocab.getIndex().get(result));
                    String val = myObj.nextLine();
                    if (val.equals(Vocab.getMap().get(Vocab.getIndex().get(result)))) {
                        System.out.println("Nice Job!");
                        numCorrect+=1;
                    } else {
                        System.out.println("Incorrect");
                        incindices.add(result);
                    }
                }
                indices.remove(result);
                if(indices.isEmpty()&incindices.isEmpty()){
                    System.out.println("Wow great job I didn't expect that from you!");
                    gameRunning = false;
                }
                if (indices.isEmpty() & !incindices.isEmpty()) {
                    System.out.println("Num correct: " + (numCorrect) + " Num incorrect: " + incindices.size());
                    System.out.println("Time to work on the ones we got wrong... only if you want tho...type y to review and anything else to terminate the game");
                    String cont = myObj.nextLine();
                    boolean flag = false;
                    if (cont.equals("y")){
                         flag = true;
                        System.out.println("Awesome! This will be great review!");
                    }
                    else{
                        System.out.println("Can't handle a little review? Game Over");
                    }
                    gameRunning = false;
                    while (flag) {
                        Integer result1 = (int) (Math.random() * (max - min) + 1);
                        if (incindices.contains(result1)) {
                            System.out.println(Vocab.getIndex().get(result1));
                            String val = myObj.nextLine();
                            if (val.equals(Vocab.getMap().get(Vocab.getIndex().get(result1)))) {
                                System.out.println("Nice Job!");
                                incindices.remove(result1);
                            } else {
                                System.out.println("Incorrect");
                            }
                            if (incindices.isEmpty()) {
                                System.out.println("Nice we fixed our issues, game over!");
                                flag = false;
                            }
                        }
                    }
                }

            }
        }
        if (gameMode.equals("Normal")) {
            for (int i = 1; i < Vocab.getMap().size(); i++) {
                indices.add(i);
            }
            System.out.println("You probably think that ketchup is spicy");
            int max = Vocab.getMap().size();
            int min = 0;
            while (gameRunning) {
                Integer result = (int) (Math.random() * (max - min) + 1);
                if (indices.contains(result)) {
                    System.out.println(Vocab.getIndex().get(result));
                    System.out.println("Please type the correct word from this list that matches the definition: ");
                    System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result)));
                    int result1;
                    int result2;
                    int result3;
                    for (int i = 1; i < Vocab.getMap().size(); i++) {
                        if(i!=result){
                            result1 = i;
                            System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result1)));
                            for (int j = 1; j < Vocab.getMap().size(); j++) {
                                if ((j!=result) & (j!=result1)){
                                    result2 = j;
                                    System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result2)));
                                    for (int k = 1; k < Vocab.getMap().size(); k++) {
                                        if ((k != result) & (k != result1) & (k != result2)) {
                                            result3 = k;
                                            System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result3)));
                                            break;
                                        }
                                    }
                                      break;
                                }

                            }
                            break;
                        }
                    }
                    String val = myObj.nextLine();
                    if (val.equals(Vocab.getMap().get(Vocab.getIndex().get(result)))) {
                        System.out.println("Nice Job!");
                        numCorrect +=1;
                    }
                    else {
                        System.out.println("Incorrect");
                        incindices.add(result);
                    }
                }
                indices.remove(result);
                if(indices.isEmpty()&incindices.isEmpty()){
                    System.out.println("Maybe only pepper is spicy for you good job completing the game");
                    gameRunning = false;
                }
                if (indices.isEmpty() & !incindices.isEmpty()) {
                    System.out.println("Num correct: " + (numCorrect) + " Num incorrect: " + incindices.size());
                    System.out.println("Time to work on the ones we got wrong... only if you want tho...type y to review and anything else to terminate the game");
                    String cont = myObj.nextLine();
                    boolean flag = false;
                    if (cont.equals("y")){
                        flag = true;
                        System.out.println("Awesome! This will be great review!");
                    }
                    else{
                        System.out.println("Can't handle a little review? Game Over");
                    }
                    gameRunning = false;
                    while (flag) {
                        Integer result1 = (int) (Math.random() * (max - min) + 1);
                        if (incindices.contains(result1)) {
                            System.out.println(Vocab.getIndex().get(result1));
                            System.out.println("Please type the correct word from this list that matches the definition: ");
                            System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result1)));
                            int result2;
                            int result3;
                            int result4;
                            for (int i = 1; i < Vocab.getMap().size(); i++) {
                                if(i!=result1){
                                    result2 = i;
                                    System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result2)));
                                    for (int j = 1; j < Vocab.getMap().size(); j++) {
                                        if ((j!=result1) & (j!=result2)){
                                            result3 = j;
                                            System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result3)));
                                            for (int k = 1; k < Vocab.getMap().size(); k++) {
                                                if ((k != result1) & (k != result2) & (k != result3)) {
                                                    result4 = k;
                                                    System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result4)));
                                                    break;
                                                }
                                            }
                                            break;
                                        }

                                    }
                                    break;
                                }
                            }
                            String val1 = myObj.nextLine();
                            System.out.println(Vocab.getMap().get(Vocab.getIndex().get(result1)));
                            if (val1.equals(Vocab.getMap().get(Vocab.getIndex().get(result1)))) {
                                System.out.println("Nice Job!");
                            }
                            else {
                                System.out.println("Incorrect");
                                incindices.add(result);
                            }
                        }
                        if (incindices.isEmpty()) {
                            System.out.println("Nice we fixed our issues, game over!");
                            flag = false;
                        }
                    }
                }

            }
        }
    }


public static void generateTerms(){

    Vocab blame = new Vocab("blame","The \"blame\" feature in Git describes the last modification to each line of a file, which generally displays the revision, author and time. This is helpful, for example, in tracking down when a feature was added, or which commit led to a particular bug.");
    Vocab branch = new Vocab("branch","A branch is a parallel version of a repository. It is contained within the repository, but does not affect the primary or main branch allowing you to work freely without disrupting the \"live\" version. When you've made the changes you want to make, you can merge your branch back into the main branch to publish your changes.");
    Vocab clone = new Vocab("clone", "A clone is a copy of a repository that lives on your computer instead of on a website's server somewhere, or the act of making that copy. When you make a clone, you can edit the files in your preferred editor and use Git to keep track of your changes without having to be online. The repository you cloned is still connected to the remote version so that you can push your local changes to the remote to keep them synced when you're online.");
    Vocab collaborator = new Vocab("collaborator","A collaborator is a person with read and write access to a repository who has been invited to contribute by the repository owner.");
    Vocab commit = new Vocab("commit", "A commit, or \"revision\", is an individual change to a file (or set of files). When you make a commit to save your work, Git creates a unique ID (a.k.a. the \"SHA\" or \"hash\") that allows you to keep record of the specific changes committed along with who made them and when. Commits usually contain a commit message which is a brief description of what changes were made.");
    Vocab commitMessage = new Vocab("commit message","Short, descriptive text that accompanies a commit and communicates the change the commit is introducing.");
    Vocab contributor = new Vocab("contributor","A contributor is someone who does not have collaborator access to a repository but has contributed to a project and had a pull request they opened merged into the repository.");
    Vocab defaultBranch = new Vocab("default branch","The base branch for new pull requests and code commits in a repository. Each repository has at least one branch, which Git creates when you initialize the repository. The first branch is usually called main, and is often the default branch.");
    Vocab diff = new Vocab("diff","A diff is the difference in changes between two commits, or saved changes. The diff will visually describe what was added or removed from a file since its last commit.");
    Vocab featurebranch = new Vocab("feature branch","A branch used to experiment with a new feature or fix an issue that is not in production. Also called a topic branch.");
    Vocab fetch = new Vocab("fetch","When you use git fetch, you're adding changes from the remote repository to your local working branch without committing them. Unlike git pull, fetching allows you to review changes before committing them to your local branch.");
    Vocab forcepush = new Vocab("forcepush","A Git push that overwrites the remote repository with local changes without regard for conflicts. Or, you know, a Star Wars ability.");
    Vocab fork = new Vocab("fork","A fork is a personal copy of another user's repository that lives on your account. Forks allow you to freely make changes to a project without affecting the original upstream repository. You can also open a pull request in the upstream repository and keep your fork synced with the latest changes since both repositories are still connected.");
    Vocab issue = new Vocab("issue","Issues are suggested improvements, tasks or questions related to the repository. Issues can be created by anyone (for public repositories), and are moderated by repository collaborators. Each issue contains its own discussion thread. You can also categorize an issue with labels and assign it to someone.");
    Vocab main = new Vocab("main","The default development branch. Whenever you create a Git repository, a branch named main is created, and becomes the active branch. In most cases, this contains the local development, though that is purely by convention and is not required.");
    Vocab merge = new Vocab("merge","Merging takes the changes from one branch (in the same repository or from a fork), and applies them into another. This often happens as a \"pull request\" (which can be thought of as a request to merge), or via the command line. A merge can be done through a pull request via the GitHub.com web interface if there are no conflicting changes, or can always be done via the command line.");
    Vocab organization = new Vocab("organization","Organizations are a group of two or more users that typically mirror real-world organizations. They are administered by users and can contain both repositories and teams.");
    Vocab privaterepository = new Vocab("private repository","Private repositories are only visible to the repository owner and collaborators that the owner specified.");
    Vocab publicrepository = new Vocab("public repository","A public repository can be viewed by anyone, including people who aren't GitHub users. I mean...did we expect anything else?");
    Vocab pull = new Vocab("pull","Pull refers to when you are fetching in changes and merging them. For instance, if someone has edited the remote file you're both working on, you'll want to pull in those changes to your local copy so that it's up to date. See also fetch.");
    Vocab pullrequest = new Vocab("pull request","Pull requests are proposed changes to a repository submitted by a user and accepted or rejected by a repository's collaborators. Like issues, pull requests each have their own discussion forum.");
    Vocab push = new Vocab("push","To push means to send your committed changes to a remote repository on GitHub.com. For instance, if you change something locally, you can push those changes so that others may access them.");
    Vocab reposiotry = new Vocab("repository","A repository is the most basic element of GitHub. They're easiest to imagine as a project's folder. A repository contains all of the project files (including documentation), and stores each file's revision history. Repositories can have multiple collaborators and can be either public or private.");
    Vocab upstream = new Vocab("upstream","When talking about a branch or a fork, the primary branch on the original repository is often referred to as the \"upstream\", since that is the main place that other changes will come in from. The branch/fork you are working on is then called the \"downstream\". Also called origin.");


}
}
