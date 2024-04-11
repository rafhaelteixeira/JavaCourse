Media Player: Develop a media player application where different types of media (Audio, Video) inherit from a common Media class. Implement methods like play() and demonstrate polymorphism by playing different media types.

Define Media Class:

Create a base class called Media with a method play().
Create Audio and Video Subclasses:

Create subclasses Audio and Video, inheriting from the Media class. Override the play() method in each subclass.
Implement Media Player:

Create a MediaPlayer class responsible for playing media.
Add a method playMedia(Media media) in the MediaPlayer class. Inside this method, call the play() method on the passed Media object.
Instantiate and Play Media:

Instantiate objects of Audio and Video classes.
Pass these objects to the playMedia() method of the MediaPlayer class.
Testing:

Test the program by playing different types of media.