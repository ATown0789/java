package java_4.logging;


import java.util.HashMap;
import java.util.Map;

//OPTIONAL exercise
public class Scribe {
	private final Map<String,String> messages;
	private final Object logger = null; //import the SLF4J java_4.logging after adding it to the java project by either manually adding the JAR files or via maven

	public Scribe() {
		messages = new HashMap<>();
		messages.put("INFO","The Scribe is in charge of documenting important information");
		messages.put("ERROR", "Even Trained Scribes can make mistakes. The question is, are they intentional or not?");
		messages.put("WARN", "Uh Oh! The pen has been lifted, and the ink has dried.");
		messages.put("TRACE", "The Scribe will backtrack his footsteps to keep track of everything");
		messages.put("DEBUG", "There are still some bugs to iron out in the code");
		messages.put("FATAL", "It's the circle of life.  We are born, we grow, then we die, making room for new life");
	}

	public void document() {
		// Log the value of the messages.INFO key at an info java_4.logging level
	}

	public void mistake() {
		// Log the value of the messages.ERROR key at an error java_4.logging level
	}

	public void warn() {
		// Log the value of the messages.WARN key at a warning java_4.logging level
	}

	public void trace() {
		// Log the value of the messages.TRACE key at a trace java_4.logging level
	}

	public void perish() {
		//Log the value of the messages.FATAL key at a fatal java_4.logging level
	}

	public void troubleshoot() {
		//Log the value of the messages.DEBUG key at a debug java_4.logging level
	}

	public void adjustLogLevel(String level) {
		// (OPTIONAL) : change the log level to any valid level.
	}

	public static void main(String[] args) {
		//	This class and each method should utilize the SLF4J java_4.logging to log some output at a different java_4.logging level.  Add the SLF4J JAR + Logging Library Implementation either manually, or via maven.
		Scribe scribe = new Scribe();
		scribe.document();
		scribe.mistake();
		scribe.warn();
		scribe.trace();
		scribe.perish();
		scribe.troubleshoot();
		System.out.println(scribe.messages.get("TRACE"));
	}

}
