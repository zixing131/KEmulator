package emulator.ui.swt;

import org.eclipse.swt.events.*;
import emulator.*;

final class Class131 extends KeyAdapter {
    private final Property aClass38_1231;

    Class131(final Property aClass38_1231) {
        super();
        this.aClass38_1231 = aClass38_1231;
    }

    public final void keyPressed(final KeyEvent keyEvent) {
        keyEvent.keyCode &= 0xFEFFFFFF;
        if (Property.method376(this.aClass38_1231).getSelectionIndex() == 0 && KeyMapping.keyToString(String.valueOf(keyEvent.keyCode)) != null) {
            Property.method388(this.aClass38_1231).setText(KeyMapping.keyToString(String.valueOf(keyEvent.keyCode)));
            Property.method365()[3] = Property.method388(this.aClass38_1231).getText().trim();
        }
    }
}
