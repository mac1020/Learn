import os
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import undetected_chromedriver as uc
from dotenv import load_dotenv

load_dotenv()
EMAIL = os.getenv("NAUKRI_EMAIL")
PASSWORD = os.getenv("NAUKRI_PASSWORD")
RESUME_PATH = r"/Users/mac/Downloads/Mehak_Kushwaha_DevOps_Resume.pdf"

def update_naukri_resume():
    options = uc.ChromeOptions()
    options.add_argument("--disable-blink-features=AutomationControlled")

    driver = uc.Chrome(options=options)
    driver.set_window_size(1200, 800)

    try:
        print("🔐 Opening Naukri login page...")
        driver.get("https://www.naukri.com/nlogin/login")

        time.sleep(3)

        print("👤 Filling login credentials...")
        driver.find_element(By.ID, "username").send_keys(EMAIL)
        driver.find_element(By.ID, "password").send_keys(PASSWORD)
        driver.find_element(By.XPATH, "//button[@type='submit']").click()

        # Wait for profile redirect
        print("⏳ Waiting for profile page...")
        time.sleep(10)
        driver.get("https://www.naukri.com/mnjuser/profile")

        print("📄 Uploading new resume...")
        upload_input = driver.find_element(By.XPATH, '//input[@type="file"]')
        upload_input.send_keys(os.path.abspath(RESUME_PATH))

        time.sleep(10)
        print("✅ Resume updated successfully!")

    except Exception as e:
        print(f"❌ Error: {e}")
        driver.save_screenshot("naukri_error.png")
        print("📸 Screenshot saved to naukri_error.png")

    finally:
        driver.quit()

if __name__ == "__main__":
    update_naukri_resume()
