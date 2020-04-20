/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author nitya
 */
public class ContactTracingWorkRequest extends WorkRequest{
      private String tracingRequest;

    public String getTracingRequest() {
        return tracingRequest;
    }

    public void setTracingRequest(String tracingRequest) {
        this.tracingRequest = tracingRequest;
    }


    
}
