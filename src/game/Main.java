package game;

import graphics.Display;

import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;

public class Main {

	private static Display display = new Display();
	
	public static void main(String[] args) {
		
		display.init(1280, 720, "gel");
		
		while(!glfwWindowShouldClose(display.glWindow)) {
			glfwSwapBuffers(display.glWindow);
			glfwPollEvents();
		}
	}
	
}
