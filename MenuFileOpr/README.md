# MenuItem and File Operations Instructions
- Create a new project in IntelliJ
- Name the project: ```fileoperation```
- <p align="left"><img src="https://github.com/JVMagician/spring2026/blob/main/MenuFileOpr/Menu_FileOpr.png" alt="fileoperation" width="600" /></p>
- Build and run the project to confirm everything is working correctly.
- You should see the default JavaFX application window.
- Verify functionality
  - Ensure the app launches without errors before continuing.

## Refactor the default files
- Ensure to right click (on the file) -> refactor -> Rename the following files:
  - hello-view.fxml → ```fileopr-view.fxml```
  - HelloApplication.java → ```FileOprApplication.java```
  - HelloController.java → ```FileOprController.java```
- Rebuild and re-run the project to confirm everything is working correctly after the refactoring.
- Replace the content of the application files with the contents of the respective files linked below:
  - [```fileopr-view.fxml```](https://github.com/JVMagician/spring2026/blob/main/MenuFileOpr/fileopr-view.fxml)
  - [```FileOprApplication.java```](https://github.com/JVMagician/spring2026/blob/main/MenuFileOpr/FileOprApplication.java)
  - [```FileOprController.java```](https://github.com/JVMagician/spring2026/blob/main/MenuFileOpr/FileOprController.java)
- Rebuild and re-run the project, you should see the GUI below.
- <p align="left"><img src="https://github.com/JVMagician/spring2026/blob/main/MenuFileOpr/Menu_file_opr.gif" alt="MenuFileOperation" width="600" /></p>
## Assignment
- Explore the source
- Implement the following menu features:
- <p align="left"> <img src="https://github.com/JVMagician/spring2026/blob/main/MenuFileOpr/menuOprNewMenu.jpg" alt="Help Menu" width="200" /></p>
### App Features
- [ ] **About Us** – Pops up a dialog with information about the app or team.  
- [ ] **Contact Us** – Pops up a dialog showing example contact details, like email, address, and phone number.  
- [ ] **Check for Update** – Pops up a dialog showing the current version and a message: *“This app is up to date.”*
