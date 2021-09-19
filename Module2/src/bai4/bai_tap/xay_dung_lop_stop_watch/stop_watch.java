package bai4.bai_tap.xay_dung_lop_stop_watch;

public class stop_watch
{
    private long start_time;
    private long end_time;

    public stop_watch()
    {
        this.start_time = System.currentTimeMillis();
    }

    public stop_watch(long start_time, long end_time)
    {
        this.start_time=start_time;
        this.end_time=end_time;
    }

    public long getStart_time()
    {
        return start_time;
    }

    public void setStart_time(long start_time)
    {
        this.start_time=start_time;
    }

    public long getEnd_time() {
        return end_time;
    }

    public void setEnd_time(long end_time)
    {
        this.end_time=end_time;
    }

    public void start()
    {
        this.start_time=System.currentTimeMillis();
    }
    public void stop()
    {
        this.end_time=System.currentTimeMillis();
    }

    public long getElapsedTime()
    {
        return this.end_time - this.start_time;
    }
}
