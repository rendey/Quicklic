package quicklic.quicklic.datastructure;

public class Axis {
	int axis_x;
	int axis_y;

	public Axis()
	{
		super();
		this.axis_x = 0;
		this.axis_y = 0;
	}

	public Axis(int axis_x, int axis_y)
	{
		super();
		this.axis_x = axis_x;
		this.axis_y = axis_y;
	}

	public int getAxis_x()
	{
		return axis_x;
	}

	public void setAxis_x( int axis_x )
	{
		this.axis_x = axis_x;
	}

	public int getAxis_y()
	{
		return axis_y;
	}

	public void setAxis_y( int axis_y )
	{
		this.axis_y = axis_y;
	}

	@Override
	public String toString()
	{
		return "Axis [axis_x=" + axis_x + ", axis_y=" + axis_y + "]";
	}

}