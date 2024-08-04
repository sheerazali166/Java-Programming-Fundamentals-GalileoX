package serialize_object;

import java.io.*;

// Save object in a file
public class Main {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream objectOutputStream = null;

        UserProfile localUserProfile = new UserProfile("Jamie", "jamieto@gmail.com",
                                            "Green", "Something Other Data");

        // Serializable
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("user_profile.txt"));
            objectOutputStream.writeObject(localUserProfile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException ioException) {
                    throw new RuntimeException(ioException);
                }
            }
        }

        // Deserialize
        UserProfile restoredUserProfile;
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("user_profile.txt"));
            restoredUserProfile = (UserProfile) objectInputStream.readObject();
            System.out.println(restoredUserProfile);
        } catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException(fileNotFoundException);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        } catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException(classNotFoundException);
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException ioException) {
                    throw new RuntimeException(ioException);
                }
            }
        }

    }
}
