/*
 * //
 * // Created by cainiaohh on 2024-03-31.
 * //
 */

package org.koishi.launcher.h2co3.controller.input.otg;

import static org.koishi.launcher.h2co3.controller.definitions.id.key.KeyEvent.KEYBOARD_BUTTON;

import android.content.Context;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;

import org.koishi.launcher.h2co3.controller.codes.AndroidKeyMap;
import org.koishi.launcher.h2co3.controller.Controller;
import org.koishi.launcher.h2co3.controller.event.BaseKeyEvent;
import org.koishi.launcher.h2co3.controller.input.HwInput;
import org.koishi.launcher.h2co3.core.launch.H2CO3LauncherBridge;

public class Keyboard implements HwInput {

    private final static String TAG = "OtgKeyboard";
    private final static int type = KEYBOARD_BUTTON;
    private Controller mController;
    private AndroidKeyMap androidKeyMap;
    private boolean isEnabled;

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }

    @Override
    public boolean load(Context context, Controller controller, H2CO3LauncherBridge bridge) {

        this.mController = controller;
        this.androidKeyMap = new AndroidKeyMap();

        return true;
    }

    @Override
    public boolean unload() {
        return true;
    }

    @Override
    public void setGrabCursor(boolean isGrabbed) {

    }

    @Override
    public void runConfigure() {

    }

    @Override
    public void saveConfig() {

    }

    private void sendKeyEvent(String keyName, boolean pressed) {
        mController.sendKey(new BaseKeyEvent(TAG, keyName, pressed, type, null));
    }

    @Override
    public boolean onKey(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_VOLUME_UP || event.getKeyCode() == KeyEvent.KEYCODE_VOLUME_DOWN || event.getKeyCode() == KeyEvent.KEYCODE_VOLUME_MUTE) {
            return false;
        }
        switch (event.getAction()) {
            case KeyEvent.ACTION_DOWN:
                if (event.getRepeatCount() == 0) {
                    this.sendKeyEvent((String) androidKeyMap.translate(event.getKeyCode()), true);
                }
                break;
            case KeyEvent.ACTION_UP:
                this.sendKeyEvent((String) androidKeyMap.translate(event.getKeyCode()), false);
                break;
        }
        return true;
    }

    @Override
    public boolean onMotionKey(MotionEvent event) {
        return false;
    }

    @Override
    public int getSource() {
        return InputDevice.SOURCE_KEYBOARD;
    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onResumed() {

    }

    @Override
    public Controller getController() {
        return this.mController;
    }
}
