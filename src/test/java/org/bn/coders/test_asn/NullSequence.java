
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1Null;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;



        @ASN1Null ( name = "NullSequence" ) 
    
    @ASN1PreparedElement
    public class NullSequence implements IASN1PreparedElement {                    
	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(NullSequence.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            