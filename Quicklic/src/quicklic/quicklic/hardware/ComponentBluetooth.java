package quicklic.quicklic.hardware;

import quicklic.floating.api.R;
import android.bluetooth.BluetoothAdapter;
import android.util.Log;

public class ComponentBluetooth {

	BluetoothAdapter bluetooth;

	public ComponentBluetooth()
	{
		bluetooth = BluetoothAdapter.getDefaultAdapter();
	}

	/**
	 * @함수명 : onBluetooth
	 * @매개변수 :
	 * @반환 : void
	 * @기능(역할) : Bluetooth 켜기
	 * @작성자 : SBKim
	 * @작성일 : 2014. 6. 24.
	 */
	private void onBluetooth()
	{
		bluetooth.enable();
	}

	/**
	 * @함수명 : offBluetooth
	 * @매개변수 :
	 * @반환 : void
	 * @기능(역할) : Bluetooth 끄기
	 * @작성자 : SBKim
	 * @작성일 : 2014. 6. 24.
	 */
	private void offBluetooth()
	{
		bluetooth.disable();
	}

	/**
	 * @함수명 : isEnabled
	 * @매개변수 :
	 * @반환 : boolean
	 * @기능(역할) :
	 * @작성자 : SBKim
	 * @작성일 : 2014. 6. 24.
	 */
	public boolean isEnabled()
	{
		return bluetooth.isEnabled();
	}

	/**
	 * @함수명 : getDrawable
	 * @매개변수 :
	 * @반환 : int
	 * @기능(역할) : Bluetooth 상태에 따른 drawable 반환
	 * @작성자 : THYang
	 * @작성일 : 2014. 6. 24.
	 */
	public int getDrawable()
	{
		if ( !isEnabled() )
			return R.drawable.bluetooth_off;
		else
			return R.drawable.bluetooth_on;
	}

	/**
	 * @함수명 : controlBluetooth
	 * @매개변수 :
	 * @반환 : void
	 * @기능(역할) : Bluetooth on/off 상태 전환
	 * @작성자 : SBKim
	 * @작성일 : 2014. 6. 24.
	 */
	public void controlBluetooth()
	{
		if ( bluetooth != null )
		{
			if ( !isEnabled() )
			{
				onBluetooth();
			}
			else
			{
				offBluetooth();
			}
		}
		else
		{
			Log.i("DEBUG_TAG", "블루투스지원안함");
		}
	}

}
