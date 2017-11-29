package com.example.gpacalculator;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText phy, chem, math, eng, dpsd, ds, dpsdlab, dslab, pclab;
	TextView result;
	float phyint, chemint, mathint, engint, dpsdint, dsint, dpsdlabint, dslabint, pclabint;
	Button submit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		phyint = chemint = mathint = engint = dpsdint = dsint = dpsdlabint = dslabint = pclabint = 0;
		//Initializing the fields.
		phy = (EditText)findViewById(R.id.phys);
		chem = (EditText)findViewById(R.id.chem);
		math = (EditText)findViewById(R.id.math);
		eng = (EditText)findViewById(R.id.engl);
		dpsd = (EditText)findViewById(R.id.dpsd);
		ds = (EditText)findViewById(R.id.ds);
		dpsdlab = (EditText)findViewById(R.id.dpsdlab);
		dslab = (EditText)findViewById(R.id.dslab);
		pclab = (EditText)findViewById(R.id.phychemlab);
		result = (TextView)findViewById(R.id.result);
		submit = (Button)findViewById(R.id.submit);
		
		//Initializing the String variables used later on.
		
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final String physics;
				final String chemistry;
				final String maths;
				final String english;
				final String dpsdd;
				final String dss;
				final String dpsdlabo;
				final String dslabo;
				final String pclabo;
				
				
				physics = phy.getText().toString();
				chemistry = chem.getText().toString();
				maths = math.getText().toString();
				english = eng.getText().toString();
				dpsdd = dpsd.getText().toString();
				dss = ds.getText().toString();
				dpsdlabo = dpsdlab.getText().toString();
				dslabo = dslab.getText().toString();
				pclabo = pclab.getText().toString();
				
				
				//Performing the assignment operations for total credit count in each subject
				//Physics
				if(physics.equals("S") || physics.equals("s")){
					phyint = 10;
				}
				else if(physics.equals("A") || physics.equals("a")){
					phyint = 9;
				}
				else if(physics.equals("B") || physics.equals("b")){
					phyint = 8;
				}
				else if(physics.equals("C") || physics.equals("c")){
					phyint = 7;
				}
				else if(physics.equals("D") || physics.equals("d")){
					phyint = 6;
				}
				else if(physics.equals("E") || physics.equals("e")){
					phyint = 5;
				}
				//Toast.makeText(getApplicationContext(), "Your points here are: "+phyint, Toast.LENGTH_LONG).show();
				//Chemistry
				if(chemistry.equals("S") || chemistry.equals("s")){
					chemint = 10;
				}
				else if(chemistry.equals("A") || chemistry.equals("a")){
					chemint = 9;
				}
				else if(chemistry.equals("B") || chemistry.equals("b")){
					chemint = 8;
				}
				else if(chemistry.equals("C") || chemistry.equals("c")){
					chemint = 7;
				}
				else if(chemistry.equals("D") || chemistry.equals("d")){
					chemint = 6;
				}
				else if(chemistry.equals("E") || chemistry.equals("e")){
					chemint = 5;
				}
				//Toast.makeText(getApplicationContext(), "Your points here are: "+chemint, Toast.LENGTH_LONG).show();
				//Maths
				if(maths.equals("S") || maths.equals("s")){
					mathint = 10;
				}
				else if(maths.equals("A") || maths.equals("a")){
					mathint = 9;
				}
				else if(maths.equals("B") || maths.equals("b")){
					mathint = 8;
				}
				else if(maths.equals("C") || maths.equals("c")){
					mathint = 7;
				}
				else if(maths.equals("D") || maths.equals("d")){
					mathint = 6;
				}
				else if(maths.equals("E") || maths.equals("e")){
					mathint = 5;
				}
				
				
				//English
				if(english.equals("S") || english.equals("s")){
					engint = 10;
				}
				else if(english.equals("A") || english.equals("a")){
					engint = 9;
				}
				else if(english.equals("B") || english.equals("b")){
					engint = 8;
				}
				else if(english.equals("C") || english.equals("c")){
					engint = 7;
				}
				else if(english.equals("D") || english.equals("d")){
					engint = 6;
				}
				else if(english.equals("E") || english.equals("e")){
					engint = 5;
				}
				
				
				//DPSD
				if(dpsdd.equals("S") || dpsdd.equals("s")){
					dpsdint = 10;
				}
				else if(dpsdd.equals("A") || dpsdd.equals("a")){
					dpsdint = 9;
				}
				else if(dpsdd.equals("B") || dpsdd.equals("b")){
					dpsdint = 8;
				}
				else if(dpsdd.equals("C") || dpsdd.equals("c")){
					dpsdint = 7;
				}
				else if(dpsdd.equals("D") || dpsdd.equals("d")){
					dpsdint = 6;
				}
				else if(dpsdd.equals("E") || dpsdd.equals("e")){
					dpsdint = 5;
				}
				
				
				
				//DS
				if(dss.equals("S") || dss.equals("s")){
					dsint = 10;
				}
				else if(dss.equals("A") || dss.equals("a")){
					dsint = 9;
				}
				else if(dss.equals("B") || dss.equals("b")){
					dsint = 8;
				}
				else if(dss.equals("C") || dss.equals("c")){
					dsint = 7;
				}
				else if(dss.equals("D") || dss.equals("d")){
					dsint = 6;
				}
				else if(dss.equals("E") || dss.equals("e")){
					dsint = 5;
				}
				
				
				//DPSDlab
				if(dpsdlabo.equals("S") || dpsdlabo.equals("s")){
					dpsdlabint = 10;
				}
				else if(dpsdlabo.equals("A") || dpsdlabo.equals("a")){
					dpsdlabint = 9;
				}
				else if(dpsdlabo.equals("B") || dpsdlabo.equals("b")){
					dpsdlabint = 8;
				}
				else if(dpsdlabo.equals("C") || dpsdlabo.equals("c")){
					dpsdlabint = 7;
				}
				else if(dpsdlabo.equals("D") || dpsdlabo.equals("d")){
					dpsdlabint = 6;
				}
				else if(dpsdlabo.equals("E") || dpsdlabo.equals("e")){
					dpsdlabint = 5;
				}
				
				
				//DSlab
				if(dslabo.equals("S") || dslabo.equals("s")){
					dslabint = 10;
				}
				else if(dslabo.equals("A") || dslabo.equals("a")){
					dslabint = 9;
				}
				else if(dslabo.equals("B") || dslabo.equals("b")){
					dslabint = 8;
				}
				else if(dslabo.equals("C") || dslabo.equals("c")){
					dslabint = 7;
				}
				else if(dslabo.equals("D") || dslabo.equals("d")){
					dslabint = 6;
				}
				else if(dslabo.equals("E") || dslabo.equals("e")){
					dslabint = 5;
				}
				
				
				//Physics and chemistry lab
				if(pclabo.equals("S") || pclabo.equals("s")){
					pclabint = 10;
				}
				else if(pclabo.equals("A") || pclabo.equals("a")){
					pclabint = 9;
				}
				else if(pclabo.equals("B") || pclabo.equals("b")){
					pclabint = 8;
				}
				else if(pclabo.equals("C") || pclabo.equals("c")){
					pclabint = 7;
				}
				else if(pclabo.equals("D") || pclabo.equals("d")){
					pclabint = 6;
				}
				else if(pclabo.equals("E") || pclabo.equals("e")){
					pclabint = 5;
				}
				final float ab = (((phyint*3)+(chemint*3)+(mathint*4)+(engint*4)+(dpsdint*3)+(dsint*3)+(dpsdlabint*2)+(dslabint*2)+(pclabint*1))/25);
			//final double aa = Math.round((ab*1000)/1000.00);
				Toast.makeText(getApplicationContext(), "Your GPA: "+ab, Toast.LENGTH_SHORT).show();
				
				result.setText("Your GPA is: "+ab+"!");
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
