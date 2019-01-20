public class Channel {

    private String name;
    private Program currentProgram;
    private Program programList[];

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Program getCurrentProgram() {
        return currentProgram;
    }

    protected Program[] getProgramList() {
        return programList;
    }

    protected void setCurrentProgram(Program currentProgram) {
        this.currentProgram = currentProgram;
    }

    protected void setProgramList(Program[] programList) {
        this.programList = programList;
    }

    protected void addProgram(Program program) {
        boolean added = false;
        for (int i = 0; i < this.programList.length && !(added); i++) {
            if (this.programList[i] == null) {
                this.programList[i] = program;
                added = true;
            }
        }
    }

    protected void removeProgram(Program program){
        boolean removed = false;
        for (int i = 0; i < this.programList.length && this.programList[i] != null; i++) {
            if (this.programList[i] == program || removed) {
                this.programList[i] = this.programList[i + 1];
                removed = true;
            }
        }
    }
}
