
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1BoxedType;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1Sequence;
import org.bn.annotations.ASN1String;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;
import org.bn.coders.TagClass;
import org.bn.coders.UniversalTag;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "TaggedSequence" )
    public class TaggedSequence implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "TaggedSequence" , isSet = false )
       public static class TaggedSequenceSequenceType implements IASN1PreparedElement {
                
    @ASN1String( name = "", 
        stringType =  UniversalTag.VisibleString , isUCS = false )
    
        @ASN1Element ( name = "type1", isOptional =  true , hasTag =  true, tag = 7 , hasDefaultValue =  false  )
    
	private String type1 = null;
                
  
        
        public String getType1 () {
            return this.type1;
        }

        
        public boolean isType1Present () {
            return this.type1 != null;
        }
        

        public void setType1 (String value) {
            this.type1 = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_TaggedSequenceSequenceType;
        }

       private static IASN1PreparedElementData preparedData_TaggedSequenceSequenceType = CoderFactory.getInstance().newPreparedElementData(TaggedSequenceSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "TaggedSequence", isOptional =  false , hasTag =  true, tag = 8, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private TaggedSequenceSequenceType  value;        

        
        
        public TaggedSequence () {
        }
        
        
        
        public void setValue(TaggedSequenceSequenceType value) {
            this.value = value;
        }
        
        
        
        public TaggedSequenceSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TaggedSequence.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            