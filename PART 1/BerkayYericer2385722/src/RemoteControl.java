
//This is the RemoteControl class, which is likely part of the Command Pattern.

class RemoteControl {
    // Holding command
    private Command command;

    RemoteControl() {
    }
    // Seting the command for execution
    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
