# Tutorial 7

## Setup

This exercise assumes that you've done the **Project setup** steps from the project spec. Once you've done them, you can import this project into VSCode and start doing the exercise.

## Testing and JavaFX

As an exercise to learn JavaFX, create a small application that lets the user type in text and click a button to add further emphasis to that text.

To start with, implement the backend or model for the application.

* In the `src/examples/emphasis` directory create a class `Emphasis` with a field containing some text (as a `String`) and a method that changes the field so that the text inside it is *emphasised*.
* In this example, text is emphasised by converting it to upper case and adding multiple exclamation points at the end.
* If the text already has an exclamation mark at the end, it should be considered sufficiently emphasised already and thus no change needs to be made.
* Initially, the text should be empty. Add a getter and setter for accessing and updating it.

Write some JUnit tests for this simple model.

* What methods need to be tested?
* What behaviour needs to be tested?
* **bonus challenge question** What property does the method for adding emphasis have that is useful to know for testing?

Change the model so that it uses a `StringProperty` instead of a `String`.

* What's the difference between the two types?
* How should the getter and setter be modified to cope with this change?
* Can the tests be run again without modification?
* Add a method for accessing the `StringProperty` directly. Follow the convention JavaFX uses for this.

Create the UI using JavaFX SceneBuilder.

**NOTE:** You can run the JavaFX SceneBuilder from CSE computers with `2511 scenebuilder`.

* Use the empty template.
* Create a `Pane` as the root element.
* Add a `TextField` and give it an `fx:id` of `text`.
* Add a `Button` with the text "Emphasise" and give it an *On Action* handler `handleEmphasis`.

Layout the UI elements like so:

![sample screenshot](screenshot.png)

Save the FXML document in the tutorial project under the `src/examples/emphasis` directory.

Create an `EmphasisController` class to act as a controller for the UI. You can generate a skeleton of a controller from within SceneBuilder. Under *Controller* on the left menu, make the *Controller Class* `examples.emphasis.EmphasisController` then click on *View* and *Show Sample Controller Skeleton*.

* Why does one of the UI controls have a corresponding field in the controller, but the other doesn't?
* Informally, what does the `@FXML` annotation do?
* Add a field for the model (`Emphasis`). Does this field need an `@FXML` annotation?
* Add a constructor that creates the model. It needs to take no arguments so that JavaFX can automatically construct it when it loads the FXML file.
* Complete the `handleEmphasise()` method such that it takes the text from the text field, passes it to the model, adds the emphasis then puts it back into the text field.
* Create an empty `initialize()` method with an `@FXML` annotation. When will this method be called?

Create an `EmphasisApplication` class that extends `javafx.application.Application`. Override the `start(...)` method to load the FXML document into a `Scene` and display it in a window. Add a `main(...)` method to launch the application. Run the application to make sure everything works.

Considering the design of the above application:

* What is wrong with the way the controller communicates between the model and the UI?
* Improve upon the design by creating a bidirectional binding between the text in the text field and the text stored in the model.
* What's the difference between a bidirectional and unidirectional binding in JavaFX?
* Simplify the `handleEmphasise()` method based on this change.
