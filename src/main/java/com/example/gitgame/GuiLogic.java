package com.example.gitgame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Random;

public class GuiLogic {
    private static ArrayList<Integer> indices = new ArrayList<>();
    private static double numRight = 0;
    private static double numdone = 0;
    private static int max;
    private static int min = 0;
    public static String getQuestion() {
        return Question;
    }

    public static String getAnswer1() {
        return answer1;
    }

    public static String getAnswer2() {
        return answer2;
    }

    public static String getAnswer3() {
        return answer3;
    }

    public static String getAnswer4() {
        return answer4;
    }

    public static double getPercentage() {
        return percentage;
    }

    private static String Question;
    private static String answer1;
    private static String answer2;
    private static String answer3;
    private static String answer4;
    private static double percentage;
    private static Integer result;

    public static void Guirunning(){
        result = (int) (Math.random() * (max - min)) + min;
        if (indices.contains(result)) {
            Question = Vocab.getIndex().get(result);
            answer1 = Vocab.getMap().get(Vocab.getIndex().get(result));
            int result1;
            int result2;
            int result3;
            for (int i = 1; i < Vocab.getMap().size(); i++) {
                if (i != result) {
                    result1 = i;
                    answer2 = Vocab.getMap().get(Vocab.getIndex().get(result1));
                    for (int j = 1; j < Vocab.getMap().size(); j++) {
                        if ((j != result) & (j != result1)) {
                            result2 = j;
                            answer3 = Vocab.getMap().get(Vocab.getIndex().get(result2));
                            for (int k = 1; k < Vocab.getMap().size(); k++) {
                                if ((k != result) & (k != result1) & (k != result2)) {
                                    result3 = k;
                                    answer4 = Vocab.getMap().get(Vocab.getIndex().get(result3));
                                    break;
                                }
                            }
                            break;
                        }

                    }
                    break;
                }
            }
    }
    percentage = numRight / numdone;
    indices.remove(result);
        }
        public static Boolean checkAnswer(String answer){
            if(answer.equals(answer1)){
                numRight +=1;
                numdone+=1;
                return true;
            }
            numdone+=1;
            return false;
        }
        public static void generateIndex(){
            for (int i = 1; i < Vocab.getMap().size(); i++) {
                indices.add(i);
                max = Vocab.getMap().size();
            }
        }
    public static void generateTerms(){

        Vocab blame = new Vocab("blame","The _ feature in Git describes the last modification to each line of a file, which generally displays the revision, author and time. This is helpful, for example, in tracking down when a feature was added, or which commit led to a particular bug.");
        Vocab branch = new Vocab("branch","A(n) _ is a parallel version of a repository. It is contained within the repository, but does not affect the primary or main branch allowing you to work freely without disrupting the \"live\" version. When you've made the changes you want to make, you can merge your branch back into the main branch to publish your changes.");
        Vocab clone = new Vocab("clone", "A(n) _ is a copy of a repository that lives on your computer instead of on a website's server somewhere, or the act of making that copy. When you make a clone, you can edit the files in your preferred editor and use Git to keep track of your changes without having to be online. The repository you cloned is still connected to the remote version so that you can push your local changes to the remote to keep them synced when you're online.");
        Vocab collaborator = new Vocab("collaborator","A(n) _ is a person with read and write access to a repository who has been invited to contribute by the repository owner.");
        Vocab commit = new Vocab("commit", "A(n) _, or \"revision\", is an individual change to a file (or set of files). When you make a commit to save your work, Git creates a unique ID (a.k.a. the \"SHA\" or \"hash\") that allows you to keep record of the specific changes committed along with who made them and when. Commits usually contain a commit message which is a brief description of what changes were made.");
        Vocab commitMessage = new Vocab("commit message","Short, descriptive text that accompanies a commit and communicates the change the commit is introducing.");
        Vocab contributor = new Vocab("contributor","A(n) _ is someone who does not have collaborator access to a repository but has contributed to a project and had a pull request they opened merged into the repository.");
        Vocab defaultBranch = new Vocab("default branch","The base branch for new pull requests and code commits in a repository. Each repository has at least one branch, which Git creates when you initialize the repository. The first branch is usually called main, and is often the default branch.");
        Vocab diff = new Vocab("diff","A(n) _ is the difference in changes between two commits, or saved changes. The diff will visually describe what was added or removed from a file since its last commit.");
        Vocab featurebranch = new Vocab("feature branch","A branch used to experiment with a new feature or fix an issue that is not in production. Also called a topic branch.");
        Vocab fetch = new Vocab("fetch","When you use git fetch, you're adding changes from the remote repository to your local working branch without committing them. Unlike git pull, fetching allows you to review changes before committing them to your local branch.");
        Vocab forcepush = new Vocab("forcepush","A Git push that overwrites the remote repository with local changes without regard for conflicts. Or, you know, a Star Wars ability.");
        Vocab fork = new Vocab("fork","A(n) _ is a personal copy of another user's repository that lives on your account. Forks allow you to freely make changes to a project without affecting the original upstream repository. You can also open a pull request in the upstream repository and keep your fork synced with the latest changes since both repositories are still connected.");
        Vocab issue = new Vocab("issue","_ are suggested improvements, tasks or questions related to the repository. Issues can be created by anyone (for public repositories), and are moderated by repository collaborators. Each issue contains its own discussion thread. You can also categorize an issue with labels and assign it to someone.");
        Vocab main = new Vocab("main","The default development branch. Whenever you create a Git repository, a branch named main is created, and becomes the active branch. In most cases, this contains the local development, though that is purely by convention and is not required.");
        Vocab merge = new Vocab("merge","_ takes the changes from one branch (in the same repository or from a fork), and applies them into another. This often happens as a \"pull request\" (which can be thought of as a request to merge), or via the command line. A merge can be done through a pull request via the GitHub.com web interface if there are no conflicting changes, or can always be done via the command line.");
        Vocab organization = new Vocab("organization","_ are a group of two or more users that typically mirror real-world organizations. They are administered by users and can contain both repositories and teams.");
        Vocab privaterepository = new Vocab("private repository","_ are only visible to the repository owner and collaborators that the owner specified.");
        Vocab publicrepository = new Vocab("public repository","A(n) _ can be viewed by anyone, including people who aren't GitHub users. I mean...did we expect anything else?");
        Vocab pull = new Vocab("pull","_ to when you are fetching in changes and merging them. For instance, if someone has edited the remote file you're both working on, you'll want to pull in those changes to your local copy so that it's up to date. See also fetch.");
        Vocab pullrequest = new Vocab("pull request","_ are proposed changes to a repository submitted by a user and accepted or rejected by a repository's collaborators. Like issues, pull requests each have their own discussion forum.");
        Vocab push = new Vocab("push","To _ means to send your committed changes to a remote repository on GitHub.com. For instance, if you change something locally, you can push those changes so that others may access them.");
        Vocab reposiotry = new Vocab("repository","A(n) _ is the most basic element of GitHub. They're easiest to imagine as a project's folder. A repository contains all of the project files (including documentation), and stores each file's revision history. Repositories can have multiple collaborators and can be either public or private.");
        Vocab upstream = new Vocab("upstream","When talking about a branch or a fork, the primary branch on the original repository is often referred to as the \"upstream\", since that is the main place that other changes will come in from. The branch/fork you are working on is then called the \"downstream\". Also called origin.");


    }
}