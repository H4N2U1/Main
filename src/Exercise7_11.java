class MyTv3 {
    private int channel, prevchannel;

    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        prevchannel = this.channel;
        this.channel = channel;
    }
    public void gotoPrevChannel() {
        setChannel(prevchannel);
    }
}
class Exercise7_11 {
    public static void main(String args[]) {
        MyTv3 t = new MyTv3();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t. getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t. getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t. getChannel());
    }
}