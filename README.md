# InstaChatGramSnap

Let's write an instagram snapchat hybrid! But first, enjoy this gif of Ewan Mcgregor as Obi-Wan Kenobi dancing around in his transport:

![obiwan](http://i.imgur.com/OxwIC0O.gif)

Now for our assignment.

## Description

Turn the IronGram project we made in class into a SnapChat-like service by making it delete the photos briefly after they are first viewed.

## Requirements

* Delete photos from the database and the disk if they were viewed by the `/photos` route [a certain number of] seconds ago. This requirement is open-ended -- you need to figure out how to do it.
* Create an input box in the upload form to let the user specify how many seconds they want the photo to exist. Store the number in the `Photo` entity. Then use that number in your deletion code.
* Add a checkbox to the upload form that makes the file permanent.
* Add an input field to the upload form to let the user type a comment. 
* Display the comment and the user that the image was sent from next to each image.
* Optional: Customize your HTML to fit your content. (e.g. a ul, or img, or some such)
* Optional: Improve the styling using CSS.
