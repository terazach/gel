package game;

import graphics.Display;
import graphics.Model;
import graphics.ModelLoad;
import graphics.Render;

import org.lwjgl.opengl.GL;
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;

public class Main {

	private static Display display = new Display();
	private static ModelLoad modelLoad = new ModelLoad();
	private static Render render = new Render();

	static float[] vertices = { -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0.5f, 0f };

	static int[] indices = { 0, 1, 3, 3, 1, 2 };

	public static void main(String[] args) {
		display.init(1280, 720, "gel");
		GL.createCapabilities();

		Model model = modelLoad.loadToVao(vertices, indices);

		while (!glfwWindowShouldClose(display.glWindow)) {
			render.load();

			render.render(model);

			glfwSwapBuffers(display.glWindow);
			glfwPollEvents();
		}

		modelLoad.cleanModel();
		display.destroy();
	}

}