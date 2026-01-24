package org.nitisha.CreationalPatterns.AbstractFactoryPattern.Problem;
// Window UI Components
class WindowsButton {
    public void render() {
        System.out.println("Rendering windows button");
    }
}

class WindowScrollBar {
    public void render() {
        System.out.println("Rendering windows scrollbar");
    }
}

//Mac UI components
class MacOSButton {
    public void render() {
        System.out.println("Rendering mac button");
    }
}

class MacOSScrollBar {
    public void render() {
        System.out.println("Rendering mac scrollbar");
    }
}

public class Application {

    public static void main(String[] args) {
        // Windows UI
        WindowsButton button = new WindowsButton();

        button.render();;

    }
}
