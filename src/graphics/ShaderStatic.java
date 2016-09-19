package graphics;

public class ShaderStatic extends Shader {
    
    private static final String VERTEX_FILE = "src/graphics/shaders/vertexShaders.txt";
    private static final String FRAGMENT_FILE = "src/graphics/shaders/fragmentShaders.txt";
 
    public ShaderStatic() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }
 
    @Override
    protected void bindAttribs() {
        super.bindAttributes(0, "position");
    }
     
     
 
}