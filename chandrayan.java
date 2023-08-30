public class chandrayan {

    private int x = 0;
    private int y = 0;
    private int z = 0;
    private char prevDir = 'i';
    private char direction;

    public chandrayan(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public char getDirection() {
        if (this.prevDir != 'i') {
            return this.prevDir;
        }
        return this.direction;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public void move(char c) {

        char direction = this.prevDir == 'U' || this.prevDir == 'D' ? this.prevDir : this.direction;

        if ((direction == 'N' || direction == 'S') && c == 'f') {
            this.y++;
        } else if ((direction == 'N' || direction == 'S') && c == 'b') {
            this.y--;
        } else if ((direction == 'E' || direction == 'W') && c == 'f') {
            this.x++;
        } else if ((direction == 'E' || direction == 'W') && c == 'b') {
            this.x--;
        } else if ((direction == 'U' || direction == 'D') && c == 'f') {
            this.z++;
        } else if ((direction == 'U' || direction == 'D') && c == 'b') {
            this.z--;
        }
    }

    public void tilt(char c) {

        if ((direction == 'N' && c == 'r') || (direction == 'S' && c == 'l')) {
            this.prevDir = 'i';
            this.direction = 'E';
        } else if ((direction == 'N' && c == 'l') || (direction == 'S' && c == 'r')) {
            this.prevDir = 'i';
            this.direction = 'W';
        } else if ((direction == 'E' && c == 'l') || (direction == 'W' && c == 'r')) {
            this.prevDir = 'i';
            this.direction = 'N';
        } else if ((direction == 'W' && c == 'l') || (direction == 'E' && c == 'r')) {
            this.prevDir = 'i';
            this.direction = 'S';
        }

        if (c == 'u' || c == 'd') {
            this.prevDir = c == 'u' ? 'U' : 'D';
        }
    }

    public void sendCommands(char[] commands) {
        for (char c : commands) {
            if (c == 'f' || c == 'b') {
                this.move(c);
            } else {
                this.tilt(c);
            }
        }
    }

}
