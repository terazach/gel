package graphics;

import org.lwjgl.glfw.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Display {

	public long glWindow;

	public void init(int width, int height, String title) {
		if (!glfwInit())
			throw new IllegalStateException("Failed to initialize GLFW!");

		glWindow = glfwCreateWindow(width, height, title, NULL, NULL);

		if (glWindow == NULL)
			throw new RuntimeException("Failed to initialize GLFW Window!");

		glfwMakeContextCurrent(glWindow);

		GLFWVidMode videoMode = glfwGetVideoMode(glfwGetPrimaryMonitor());

		glfwSetWindowPos(glWindow, ((videoMode.width() - width) / 2), ((videoMode.height() - height) / 2));
	}
	
	public void destroy() {
		glfwDestroyWindow(glWindow);
		glfwTerminate();
	}
}