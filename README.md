Entrata Assessment for SDET
Candidate Name: Prathamesh Ausekar
email: prathamesh.ausekar1@gmail.com
cell: +91 9518347599

What does each test do? 
Base Test: Base test launches firefox driver before the start of test suite and closes the browser after every suite run.

Header Test: HeaderTest tests weather the header tabs such as Products, Solutions, Resources, Base Camp Login Button are correctly loaded or not
Watch Demo has dedicated tests to test weather form is getting filled up or not, and thats why it has been excluded from this Header test.

Products test: Products test makes sure that Products tab is present in the home page also after hovering the products tab it makes sure
that the product management page is navigable/reachable.  

Resident pay test: Resident pay test makes sure the products tab is present and Resident pay pages is navigable/reachable.

Watch demo page test: Watch demo page test makes sure the registration page to get the demo link is reachable and form works properly 
Note: The form is tested for filling details but not for submission as instructed.

Instructions to run the tests:
First get the tests in your machine: 
Step 1: Copy the Repository URL: Go to the GitHub repository you want to clone and copy the repository URL. 
You can find the URL by clicking on the green "Code" button and selecting the appropriate option (HTTPS or SSH).

Step 2: Open Terminal or Command Prompt: Open your terminal or command prompt on your local machine.

Step 3: Navigate to the Desired Directory: Use the cd command to navigate to the directory where you want to clone the repository. For example:
cd path/to/desired-directory

Step 4: Clone the Repository: Use the git clone command followed by the repository URL. Here's the basic syntax:
git clone <repository-url>
For example, if the repository URL is https://github.com/username/repository.git, you would run:
git clone https://github.com/username/repository.git
If you're using SSH, the command would be something like:
git clone git@github.com:username/repository.git

Step 5:Enter Your GitHub Credentials (if prompted): If the repository is private and you haven't configured SSH keys, you may be prompted to enter your GitHub username and password.

Step 6:Wait for the Clone to Complete: Git will download the entire repository to your local machine. Once the clone is complete, you'll see a message indicating that the repository has been cloned successfully.
Step 7:Navigate to the Cloned Repository: Use the cd command to navigate into the cloned repository directory:
cd repository-name

Now you have the tests in your local machine, you can play with it.
1st way: To run the tests using TestNG, just open the project directory with eclipse right click on the tests in eclispe, and click run as TestNG Test.
2nd way: open the command prompt, go to the location where your POM.xml is located, and run the command mvn verify.
